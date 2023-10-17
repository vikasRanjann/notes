import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root',
})
export class PaymentService {
  url = 'http://localhost:3000/payment';

  constructor(private http: HttpClient) {}

  makePayment(source, amount) {
    const token = sessionStorage['token'];
    const httpOptions = {
      headers: new HttpHeaders({
        token: token,
      }),
    };

    const body = { source, amount };

    return this.http.post(this.url + '/charge', body, httpOptions);
  }
}
