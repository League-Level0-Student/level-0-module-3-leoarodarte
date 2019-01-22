void setup(){
  size(800,800);
  int x=310;
  for(int i=21; i>0; i--){
    x-=15;
 
  if(i%2==1){
    fill(255,0,0);
  }else{
    fill(255,255,255);
  }
  ellipse(400, 400, x, x);
  }
  
  
  
  
}
void draw(){
  
}