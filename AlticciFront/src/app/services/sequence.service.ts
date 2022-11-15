import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class SequenceService {

  public baseUrl = "http://localhost:8080/alticci/";

  constructor(private httpClient: HttpClient) { }

  alticci(number: any): Observable<any> {
    console.log(this.httpClient.get(this.baseUrl+number));
    return this.httpClient.get(this.baseUrl+number);
  }

 
}
