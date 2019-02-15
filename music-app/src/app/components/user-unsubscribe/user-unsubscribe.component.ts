import { Component, OnInit, Input } from '@angular/core';
import { environment } from '../../../environments/environment';
import { UserService } from '../../services/user.service';
import { User } from '../../model/User';
import { AuthService } from '../../services/auth.service';
import { ActivatedRoute, Router } from '@angular/router';


@Component({
  selector: 'app-user-unsubscribe',
  templateUrl: './user-unsubscribe.component.html',
  styleUrls: ['./user-unsubscribe.component.css']
})
export class UserUnsubscribeComponent implements OnInit {

  submitted = false;
  userNavs: Array<{title: string}>;
  constructor(private userService: UserService, private authService: AuthService, private router: Router, private route: ActivatedRoute) { }

  returnUrl = 'http://localhost:8080/signup';
  user = AuthService.getLoggedInUser();
  unsubscribe() {
    this.userService.updateUserSubscription(this.user.userid)
      .subscribe(
        data => {
          console.log(data);
          this.user = data;
        },
        error => console.log(error));
        this.submitted = true;
  }

  logout() {
    localStorage.removeItem('authToken');
    this.router.navigate([this.returnUrl]);
    window.location.reload();
  }

  ngOnInit() {
    this.userNavs = environment.UserNav;
  }

}
