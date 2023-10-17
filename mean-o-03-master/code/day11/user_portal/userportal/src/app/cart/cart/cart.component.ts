import { Component, OnInit } from '@angular/core';
import { CartService } from '../cart.service';
import { PaymentService } from '../payment.service';

declare var stripeCheckout: StripeCheckoutStatic;

@Component({
  selector: 'app-cart',
  templateUrl: './cart.component.html',
  styleUrls: ['./cart.component.css'],
})
export class CartComponent implements OnInit {
  items = [];
  totalPrice = 0;

  handler: StripeCheckoutHandler;

  constructor(
    private paymentService: PaymentService,
    private service: CartService
  ) {}

  ngOnInit(): void {
    this.loadCartItems();
    this.handler = StripeCheckout.configure({
      key: 'pk_test_4laBMFVMDcMP0WJUXasUSRoO',
      source: async (source) => {
        console.log(source);
        this.paymentService
          .makePayment(source.id, this.totalPrice)
          .subscribe((response) => {
            if (response['status'] == 'success') {
              this.loadCartItems();
            } else {
              alert(response['error']);
            }
          });
      },
    });
  }

  onUpdateQuantity(product, quantity) {
    this.service.updateQuantity(product._id, quantity).subscribe((response) => {
      if (response['status'] == 'success') {
        this.loadCartItems();
      } else {
        alert(response['error']);
      }
    });
  }

  loadCartItems() {
    this.service.getItems().subscribe((response) => {
      if (response['status'] == 'success') {
        this.items = response['data'];
        this.totalPrice = 0;
        this.items.forEach((item) => {
          this.totalPrice += item.product.price * item.quantity;
        });
      } else {
        alert(response['error']);
      }
    });
  }

  onCheckout() {
    this.handler.open({
      name: 'test user',
      description: 'user is placing an order',
      amount: this.totalPrice * 100,
      currency: 'inr',
      email: 'pythoncpp@gmail.com',
    });
  }
}
