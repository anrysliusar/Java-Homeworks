import {Component, OnInit} from '@angular/core';
import {User} from "./models/user";
import {UserService} from "./services/user.service";
import {HttpClient, HttpClientModule} from "@angular/common/http";

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit{
  title = 'ui';


  users : User[] = []

  user = {name: "", age: null};
  chosenUser = {name: "", age: null};


  constructor(private userService: UserService, private httpClient: HttpClient) {
  }

  ngOnInit(): void {
    this.getAllUsers()
  }

  getAllUsers(): void{
    this.userService.getAll().subscribe(value => this.users = value)
  }

  getById(id: number): void{
    this.userService.getById(id).subscribe(value => this.chosenUser = value)

  }

  saveUser() {
    this.userService.save(this.user).subscribe(() => this.getAllUsers())
  }


  deleteUser(id: any){
    this.userService.deleteById(id).subscribe(() => this.getAllUsers())

  }
}
