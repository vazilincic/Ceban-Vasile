package com.company;
public class Box
{
    double height,width,depth;
    Box() {
        this.height =this.width =this.depth = 1;
    }
    Box(double length)
    {
        this.height = this.width =this.depth = length;
    }
    Box(double height, double width, double depth)
    {
        this.height = height;
        this.width = width;
        this.depth = depth;
    }
    double getSurface()
    {
        return (4*this.height*this.width+2*this.width*this.depth);
    }
    double getVolume()
    {
        return (this.depth*this.width*this.height);
    }
}
