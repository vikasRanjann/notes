import { Route } from '@angular/compiler/src/core';
import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import * as moment from 'moment';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css'],
})
export class HomeComponent implements OnInit {
  constructor(private router: Router) {}
  private currentTime = new Date();

  getCurrentTime() {
    const time = moment().format('HH:mm:ss');
    return time;
  }

  ngOnInit(): void {
    setInterval(() => {
      this.currentTime = new Date();
    }, 1000);
  }

  onLogout() {
    // setTimeout(() => {
    sessionStorage.removeItem('token');
    this.router.navigate(['/auth/signin']);
    // }, 5000);
  }
}
