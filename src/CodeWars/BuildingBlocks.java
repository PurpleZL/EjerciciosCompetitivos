package CodeWars;

/*
Write a class Block that creates a block (Duh..)

Requirements
The constructor should take an array as an argument, this will contain 3 
integers of the form [width, length, height] from which the Block should be created.
Define these methods:
`getWidth()` return the width of the `Block`
`getLength()` return the length of the `Block`
`getHeight()` return the height of the `Block`
`getVolume()` return the volume of the `Block`
`getSurfaceArea()` return the surface area of the `Block`
 */
public class BuildingBlocks {
    
}

class Block{
    private int width;
    private int length;
    private int height;
    private int volume;
    private int surfaceArea;

    public Block(int[] array) {
        this.width = array[0];
        this.length = array[1];
        this.height = array[2];
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getVolume() {
        return width * length * height;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getSurfaceArea() {
        return 2 * (width * length + width * height + length * height);
    }

    public void setSurfaceArea(int surfaceArea) {
        this.surfaceArea = surfaceArea;
    }
    
    
}
