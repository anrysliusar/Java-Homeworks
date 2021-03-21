import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {User} from "../models/user";
import {Observable} from "rxjs";

@Injectable({
  providedIn: 'root'
})
export class UserService {

  URL = "http://localhost:8080/users"
  constructor(private httpClient: HttpClient) { }

  getAll(): Observable<User[]>{
    return this.httpClient.get<User[]>(this.URL)
  }

  save(user: any): Observable<any>{
    return this.httpClient.post<User>(this.URL, user)
  }

  getById(id: number): Observable<any>{
    return this.httpClient.get<User>(`${this.URL}/${id}`)
  }

  deleteById(id: number): Observable<any>{
    return this.httpClient.delete<User>(`${this.URL}/${id}`);
  }
}
