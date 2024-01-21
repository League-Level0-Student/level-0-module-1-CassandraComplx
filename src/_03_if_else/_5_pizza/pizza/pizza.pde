PImage pepperoni;
PImage mushroom;
PImage olive;
void setup() {
    size(800,800);
    pepperoni = loadImage("pepperoni.png");
    mushroom = loadImage("mushroom.png");
    olive = loadImage("olive.png");
}
void draw() {
    ellipse(400, 400, 700, 700);
    fill(212, 93, 53);
    ellipse(400, 400, 600, 600);
    fill(237, 183, 66);
    ellipse(400,400,570,570);
    fill(242, 194, 138);

  if(mousePressed){
    image(pepperoni,200,230);
    image(mushroom,300,390);
    image(pepperoni,450,390);
    image(pepperoni,340,560);
    image(mushroom,500,300);
    image(olive,180,500);
    image(olive,400,170);
}
}
