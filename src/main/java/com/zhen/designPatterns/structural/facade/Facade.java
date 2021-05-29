package com.zhen.designPatterns.structural.facade;

public class Facade {

    public Facade() {

    }

    public void makeTea()
    {
        System.out.println("getting water!");
        Water water = new Water();

        System.out.println("getting water boiler!");
        WaterBoiler waterBoiler = new WaterBoiler();
        System.out.println("pouring water into the boiler!");
        waterBoiler.pourInWater(water);
        System.out.println("getting hot water!");
        waterBoiler.boilWater();

        System.out.println("getting tea cup!");
        TeaCup teaCup = new TeaCup();
        System.out.println("adding water to teacup");
        teaCup.addCupContent(water);

        System.out.println("getting tea leaf");
        BlackTeaLeaf blackTeaLeaf = new BlackTeaLeaf();
        System.out.println("adding tea leaf to teacup");
        teaCup.addCupContent(blackTeaLeaf);

        System.out.println("mixing tea!");
        mixTea(teaCup);

        System.out.println(teaCup.toString());
    }

    private void mixTea(TeaCup teaCup)
    {
        boolean hasHotWater = false;
        boolean hasTeaLeaf = false;

        for(Object obj: teaCup.getCupContent())
        {
            if(obj.getClass() == Water.class)
            {
                if(((Water) obj).getTemperature().equals("Hot"))
                {
                    hasHotWater = true;
                }
            }
            if(obj.getClass() == BlackTeaLeaf.class)
            {
                hasTeaLeaf = true;
            }
        }
        System.out.println(hasHotWater);
        System.out.println(hasTeaLeaf);

        teaCup.getCupContent().clear();
        if(hasHotWater == true && hasTeaLeaf == true)
        {
            Tea tea = new Tea();
            teaCup.addCupContent(tea);
        }
        else
        {
            UnknownLiquid unknownLiquid = new UnknownLiquid();
            teaCup.addCupContent(unknownLiquid);
        }
    }


}
