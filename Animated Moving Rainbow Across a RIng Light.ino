// #include <Adafruit_NeoPixel.h> 
//   #ifdef _AVR_
//   #include <avr/power.h> 
//   #endif 
//   int rep = 1234;
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
//   int orange = 0;
//   int yellow = 0;
//   int green = 0;
//   int blue = 0;
//   int indigo = 0;
//   int violet = 0;
//   void loop() {
//     for (int r = 0, r1= 1, o= 2, o1= 3, y= 4, y1= 5, g= 6, g1 = 7, b = 8, b1 = 9, i = 10, v = 11;
//     r<rep, r1<rep, o<rep, o1<rep, y<rep, y1<rep, g<rep, g1<rep, b<rep, b1<rep, i<rep, v<rep;
//     r++, r1++, o++, o1++, y++, y1++, g++, g1++, b++, b1++, i++, v++) {
//       strip.clear();
//       if (r>11) {
//         r = 0;
//       }
//       if (r1>11) {
//         r1 = 0;
//       }
//       if (o>11) {
//         o = 0;
//       }
//       if (o1>11) {
//         o1 = 0;
//       }
//       if (y>11) {
//         y = 0;
//       }
//       if (y1>11) {
//         y1 = 0;
//       }
//       if (g>11) {
//         g = 0;
//       }
//       if (g1>11) {
//         g1 = 0;
//       }
//       if (b>11) {
//         b = 0;
//       }
//       if (b1>11) {
//         b1 = 0;
//       }
//       if (i>11) {
//         i = 0;
//       }
//       if (v>11) {
//         v = 0;
//       }
//       strip.setPixelColor(r, 0xFF0000);
//       strip.setPixelColor(r1, 0xFF0000);
//       strip.setPixelColor(o, 0xFFA500);
//       strip.setPixelColor(o1, 0xFFA500);
//       strip.setPixelColor(y, 0xFFFF00);
//       strip.setPixelColor(y1, 0xFFFF00);
//       strip.setPixelColor(g, 0x00FF00);
//       strip.setPixelColor(g1, 0x00FF00);
//       strip.setPixelColor(b, 0x0000FF);
//       strip.setPixelColor(b1, 0x0000FF);
//       strip.setPixelColor(i, 0x4B0082);
//       strip.setPixelColor(v, 0x8F00FF);
//       strip.show();
//       delay(100);  

//     }
//        for (int f = 1; f<rep; f++) {


//     }


//     strip.show();
//     delay(100);
//   }