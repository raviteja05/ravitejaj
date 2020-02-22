import React from 'react'
import {Menu} from '../components/header/menu/Menu'
import {Logo} from '../components/header/logo/Logo'
import { GridComponent } from '../components/body/components';

class App extends React.Component{
    
    render(){
        const obj=[{name:'Home'},{name:'Messages'},{name:'About'},{name:'Help'}];
        return <div><Logo/><Menu data={obj}/><GridComponent/></div>
    }
}

export default App;