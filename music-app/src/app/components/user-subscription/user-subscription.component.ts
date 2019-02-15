import { Component, OnInit } from '@angular/core';
import { environment } from '../../../environments/environment';
import { NgForm } from '@angular/forms';
import { SubscriptionService } from '../../services/subscription.service';
import {Subscription} from '../../model/subscription';
import { UserService } from '../../services/user.service';
import { User } from '../../model/User';
import { AuthService } from '../../services/auth.service';

@Component({
  selector: 'app-user-subscription',
  templateUrl: './user-subscription.component.html',
  styleUrls: ['./user-subscription.component.css']
})
export class UserSubscriptionComponent implements OnInit {

  subscription: Subscription = new Subscription();
  submitted = false;
  user = AuthService.getLoggedInUser();
  NonSubNav: Array<{title: string}>;

  constructor(private subscriptionService: SubscriptionService, private userService: UserService) { }

  ngOnInit() {
    this.NonSubNav = environment.NonSubNav;
  }

  save() {
    this.subscriptionService.addCardInfo(this.subscription)
      .subscribe(data => console.log(data), error => console.log(error));
       this.subscription = new Subscription();
  }

  onSubmit() {
    this.submitted = true;
      this.userService.updateUserSubscription(this.user.userid)
        .subscribe(
          data => {
            console.log(data);
            this.user = data;
          },
      error => console.log(error));
      this.submitted = true;
    }
}
