PImage face;

void setup() {
  size(900,700);
face = loadImage("face.jpg");
 face.resize(900,700);
 
 background(face);
}
void draw() {
  image (face, 1,1);

fill(152, 217, 106);
ellipse(360, 265, 120, 50);
ellipse(533, 265, 120, 50);

fill(0, 0, 0);
ellipse(360, 265, 70, 25);
ellipse(533, 265, 70, 25);
}
