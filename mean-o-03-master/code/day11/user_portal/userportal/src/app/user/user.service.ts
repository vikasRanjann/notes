import { Injectable } from '@angular/core';
import {
  CanActivate,
  Router,
  ActivatedRouteSnapshot,
  RouterStateSnapshot,
} from '@angular/router';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root',
})
export class UserService implements CanActivate {
  url = 'http://localhost:3000/user';

  constructor(private router: Router, private http: HttpClient) {}

  canActivate(route: ActivatedRouteSnapshot, state: RouterStateSnapshot) {
    if (sessionStorage.getItem('token')) {
      // user is already logged in
      return true;
    }

    // user is not yet logged in
    this.router.navigate(['/user/signin']);
    return false;
  }

  signup(
    firstName: string,
    lastName: string,
    email: string,
    phone: string,
    password: string
  ) {
    const body = {
      firstName,
      lastName,
      email,
      phone,
      password,
    };

    return this.http.post(this.url + '/signup', body);
  }

  signin(email: string, password: string) {
    const body = {
      email,
      password,
    };

    console.log(body);
    return this.http.post(this.url + '/signin', body);
  }
}
