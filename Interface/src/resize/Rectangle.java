package resize;

public class Rectangle implements Resizable{
	double w,h;
	
	Rectangle(double w,double h){
		this.w=w;
		this.h=h;
	}
	@Override
	public void resizewidth(int width) {
		// TODO Auto-generated method stub
		this.w=width;
	}

	@Override
	public void resizeheight(int height) {
		// TODO Auto-generated method stub
		this.h=height;
	}

}
