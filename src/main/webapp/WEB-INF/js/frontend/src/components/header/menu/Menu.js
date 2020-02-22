import React from 'react';

export const Menu=(data)=>{
    
    return <div className="ui attached stackable menu">
        <MenuElement data={data}/>
    </div>
}

export const MenuElement=(data)=>{
    console.log(data);
    return data.data.data.map(obj=>{
        return <React.Fragment key={obj.name}> <a className="item" href='/'>
        {obj.name}
      </a></React.Fragment>
    });
}