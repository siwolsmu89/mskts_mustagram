import React, {Component} from "react";
import {BrowserRouter,Route} from 'react-router-dom'
import MemberPageRouter from "./route/MemberPageRouter";
import MainPageRouter from "./route/MainPageRouter";
import 'bootstrap/dist/css/bootstrap.css'

class App extends Component {
  render(){
    return (
        <BrowserRouter>
            <MemberPageRouter/>
            <MainPageRouter/>
        </BrowserRouter>
    )
  }
}

export default App
