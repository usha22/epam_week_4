package epam.build;
public class builder
{
	float cost;
	float estimate_cost(int material_standard,float areaofhouse,boolean fullyautomated)
	{
		switch(material_standard)
		{
		case 1: cost=(1200*areaofhouse); break;
		case 2: cost=(1500*areaofhouse); break;
		case 3: cost=(1800*areaofhouse); break;
		case 4: if(fullyautomated==true) {
			cost=(2500*areaofhouse);
		}break;
		default:break;
		}
		return cost;
	}
}