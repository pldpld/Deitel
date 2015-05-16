// Time class
public class Time1
{
  private int h, m, s;

  public void setTime(int HH, int MM, int SS)
  {
    if ( (HH <= 24 && HH >= 0) && (MM <= 60 && MM >= 0) && (SS <= 60 && SS >= 0) )
    {
      h = HH;
      m = MM;
      s = SS;
    }
    else
      throw new IllegalArgumentException("hour, minute or second was out of rage");
  }

  public String toUniversalString()
  {
    return String.format("Universal Format: %02d:%02d:%02d", h, m, s);
  }
}



