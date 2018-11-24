PImage face;
void setup(){
  
  size(960,1440);
face=loadImage("Spongebob.jpg");
    background(face);

  
  
  
}
void draw(){
  background(face);
  ellipse(400, 570, 170, 200);
  fill(250,250,250);
  ellipse(mouseX, mouseY, 100, 150);

  fill(250,250,250);
  
  ellipse(600, 570, 170, 200);
  fill(0 ,0,0);
  ellipse(mouseX, mouseY, 50, 50);
  
}