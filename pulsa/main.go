package main

import (
	"fmt"
	"html/template"
	"net/http"
	"strconv"
)

var balance int = 50000

func main() {
	http.HandleFunc("/", homePage)
	http.HandleFunc("/transfer", transferPulsa)
	http.HandleFunc("/request-pulsa", requestPulsa)
	http.HandleFunc("/check-balance", checkBalance)
	fmt.Println("Server running on http://localhost:8080")
	fmt.Println("Input the link above that this program provide or just hold left control (on your keyboard) and left click the link")
	http.ListenAndServe(":8080", nil)
}

func homePage(w http.ResponseWriter, r *http.Request) {
	tmpl := template.Must(template.ParseFiles("index.html"))
	tmpl.Execute(w, nil)
}

func transferPulsa(w http.ResponseWriter, r *http.Request) {
	if r.Method == "POST" {
		phoneNumber := r.FormValue("phoneNumber")
		amountStr := r.FormValue("amount")

		amount, err := strconv.Atoi(amountStr)
		if err != nil || amount <= 0 {
			renderResponse(w, "Invalid amount. Please try again.", "error")
			return
		}

		if balance < amount {
			renderResponse(w, fmt.Sprintf("Insufficient balance. Current balance: %d", balance), "error")
			return
		}

		balance -= amount
		renderResponse(w, fmt.Sprintf("Successfully transferred %d to %s. Remaining balance: %d", amount, phoneNumber, balance), "success")
	}
}

func requestPulsa(w http.ResponseWriter, r *http.Request) {
	if r.Method == "POST" {
		phoneNumber := r.FormValue("phoneNumber")
		amountStr := r.FormValue("amount")

		amount, err := strconv.Atoi(amountStr)
		if err != nil || amount <= 0 {
			renderResponse(w, "Invalid amount. Please try again.", "error")
			return
		}

		balance += amount
		renderResponse(w, fmt.Sprintf("Successfully received %d from %s. New balance: %d", amount, phoneNumber, balance), "success")
	}
}

func checkBalance(w http.ResponseWriter, r *http.Request) {
	renderResponse(w, fmt.Sprintf("Your current balance is: %d", balance), "success")
}

func renderResponse(w http.ResponseWriter, message string, messageType string) {
	tmpl := template.Must(template.ParseFiles("response.html"))
	tmpl.Execute(w, struct {
		Message     string
		MessageType string
	}{Message: message, MessageType: messageType})
}
