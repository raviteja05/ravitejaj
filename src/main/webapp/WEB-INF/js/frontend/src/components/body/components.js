import React from 'react';

export const GridComponent=()=>{
    return (<div className="ui vertically divided grid">
        <ColumnComponent/>
       
  </div>);
} 

export const ColumnComponent=()=>{
    return (<div class="three column row">
          <Segment/>
        <Segment/>
        <Segment/>
 </div>);
}

export const SegmentList=()=>{
    return (<div class="ui segment">
      
  </div>);

}
export const Segment=(component)=>{
    return (<div className="column">
       Hello 
  </div>);

}

