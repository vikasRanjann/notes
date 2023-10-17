import { Component, OnInit } from '@angular/core';
import { UserService } from '../user.service';

@Component({
  selector: 'app-user-list',
  templateUrl: './user-list.component.html',
  styleUrls: ['./user-list.component.css'],
})
export class UserListComponent implements OnInit {
  users = [];

  constructor(private service: UserService) {}

  ngOnInit(): void {
    this.loadUsers();
  }

  onToggleStatus(user) {
    this.service.toggleUser(user._id, !user.isActive).subscribe((response) => {
      if (response['status'] == 'success') {
        this.loadUsers();
      } else {
        alert(response['error']);
      }
    });
  }

  loadUsers() {
    this.service.getUsers().subscribe((response) => {
      if (response['status'] == 'success') {
        this.users = response['data'];
      } else {
        alert(response['error']);
      }
    });
  }
}
