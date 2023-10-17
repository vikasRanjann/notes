import { Component, OnInit } from '@angular/core';
import { OrderService } from '../order.service';

@Component({
  selector: 'app-order-list',
  templateUrl: './order-list.component.html',
  styleUrls: ['./order-list.component.css'],
})
export class OrderListComponent implements OnInit {
  orders = [];

  constructor(private service: OrderService) {}

  ngOnInit(): void {
    this.loadOrders();
  }

  loadOrders() {
    this.service.getOrders().subscribe((response) => {
      if (response['status'] == 'success') {
        this.orders = response['data'];
      } else {
        alert(response['error']);
      }
    });
  }
}
