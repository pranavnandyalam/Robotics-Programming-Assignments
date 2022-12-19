#include <Adafruit_NeoPixel.h>
#ifdef __AVR__
#include <avr/power.h>
#endif
 
int const NUM_PIXELS = 12;
int8_t const PIN=13;
Adafruit_NeoPixel strip;
 
const uint8_t TRUE = 1;
const uint8_t FALSE = 0;
 
 
void setup() {
  strip = Adafruit_NeoPixel(NUM_PIXELS, PIN, NEO_GRB + NEO_KHZ800);
  strip.begin();
  strip.setBrightness(25);
 
  strip.show(); // Init all pixels to "off"
  pinMode(2,INPUT_PULLUP);
}
 
uint8_t red = 0x00;
uint8_t blue= 0xFF;
uint8_t green= 0x00;
 
bool blueUP = FALSE;
bool greenUP= TRUE;
bool blueMove= FALSE;
 
 
void loop() {

  if (green >= 0xFF && blueMove == FALSE) {
    blueMove = TRUE;
    blueUP = FALSE;
  } else if (green <= 0x00) { 
    greenUP = TRUE;
  } else if (blue >= 0xFF && blueMove == TRUE) {
    blueMove = FALSE;
    greenUP = FALSE;
  } else if (blue <= 0x00 ) {
    blueUP = TRUE;
  }
 
  // State activities
  if (blueMove) {
    if (blueUP == TRUE) {
       blue++;
    } else {
       blue--;
    }
   
  } else {
      if (greenUP == TRUE) {
      green++;
    } else {
      green--;
    }
   
  }
 
  // Finally activate the lights
  for (int i=0; i < NUM_PIXELS; i++) {
  strip.setPixelColor(i,red, green, blue);
  }
  strip.show();
  delay(150);
}