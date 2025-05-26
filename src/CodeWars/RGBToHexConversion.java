package CodeWars;

/*
The rgb function is incomplete. Complete it so that passing in RGB decimal
values will result in a hexadecimal representation being returned. 
Valid decimal values for RGB are 0 - 255. 
Any values that fall out of that range must be rounded to the closest 
valid value.
Note: Your answer should always be 6 characters long
255, 255, 255 --> "FFFFFF"
255, 255, 300 --> "FFFFFF"
0, 0, 0       --> "000000"
148, 0, 211   --> "9400D3"
 */
public class RGBToHexConversion {
    public static void main(String[] args) {
        System.out.println(rgb(254, 253, 252));
    }
    
    public static String rgb(int r, int g, int b) {
        String code="";
        if (r<0) {
            r=0;
        }else if(r>255){
            r=255;
        }    
        if (g<0) {
            g=0;
        }else if(g>255){
            g=255;
        }  
        if (b<0) {
            b=0;
        }else if(b>255){
            b=255;
        }  
        code+=Integer.toHexString(r/16).toUpperCase();
        code+=Integer.toHexString(r%16).toUpperCase();
        code+=Integer.toHexString(g/16).toUpperCase();
        code+=Integer.toHexString(g%16).toUpperCase();
        code+=Integer.toHexString(b/16).toUpperCase();
        code+=Integer.toHexString(b%16).toUpperCase();
        return code;
    }
}
