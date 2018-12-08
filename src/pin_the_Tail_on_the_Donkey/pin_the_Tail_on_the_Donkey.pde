 
PImage donkey;
PImage tail;
boolean moving=true;

void setup(){
  size(432, 407);
  donkey = loadImage("Donkey.jpg");
  tail = loadImage("Donkey-tail.jpg");  
  tail.resize(50, 100);
  
  
  
  
  
}
void draw(){
  if(moving){
    rect(0, 0, 30, 30);
    rect(350, 140, 30, 30);
    if(dist(0, 0, mouseX, mouseY)<30.0) {
      background(donkey);
    }
    else{
      background(0, 0, 0);
    }
  
    image(tail, mouseX-10, mouseY-20);
 
    if(mousePressed && mouseX>300 && mouseX<400 && mouseY>100 && mouseY<300){
      background(donkey);
      image(tail, mouseX-10, mouseY-20);
      moving=false;
    }
  }
}