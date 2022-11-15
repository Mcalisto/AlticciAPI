import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup } from '@angular/forms';
import { SequenceService } from './services/sequence.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit{

  form!: FormGroup;

  constructor(private sequenceService: SequenceService) {

    this.form = new FormGroup({
      number: new FormControl('', []),
      result: new FormControl('', []),
    });
  
   }

  ngOnInit(): void {
    
  }

 
  title = 'AlticciFront';
  
  alticciResult(){
    this.sequenceService.alticci(this.form.get('number')?.value).subscribe(
      (res)=>{
        console.log(res);
        this.form.get('result')?.setValue(res);
      }
    );
    
  }
}


