int x=310;
int loc=400;
int loc2=1200;
void setup(){
  size(1500,800);
 
 
  
  
  
}
void draw(){
  background(206,204,204);
   for(int i=21; i>0; i--){
    noFill();
 ellipse(loc, 400, x, x);
  ellipse(loc2, 400, x, x);
  x-=15;
  
  
  }
  x=310;
  loc++;
  loc2--;
}