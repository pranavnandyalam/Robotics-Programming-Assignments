// #include <Adafruit_NeoPixel.h> 
//   #ifdef _AVR_
//   #include <avr/power.h> 
//   #endif 
//   int const NUM_PIXELS = 12;
//   int8_t const PIN = 13;
//   Adafruit_NeoPixel strip;
// void setup() {
//   strip = Adafruit_NeoPixel(NUM_PIXELS, PIN, NEO_GRB+NEO_KHZ800) ;
//   strip.setBrightness(25);
//   strip.begin();
//   strip.show(); // Init all pixels to "off"
//   }

//   int red = 0;
//   void loop() {
//     for (int i = 0; i<NUM_PIXELS; i++) {
//       strip.setPixelColor(i, 0x000000);
//       strip.show();
      

//       strip.setPixelColor(i, red, 0x00, 0xFF);

//       delay(100);

//     }
//     red = (red +1 )%256;
//     strip.show();
//     delay(100);
//   }