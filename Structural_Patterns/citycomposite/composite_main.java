package Structural_Patterns.citycomposite;

public class composite_main {
    public static void main(String[] args) {
        // create the root of the tree
        City c1 = new Leaf("Mumbai",21673000);
        City c2 = new Leaf("Delhi", 18954000);
        City c3 = new Leaf("Ahmedabad", 17092000);
        City c4 = new Leaf("Surat", 1200000);
        City c5 = new Leaf("Banglore", 1000000);
        City c6 = new Leaf("Pune", 750000);

        Composite mh = new Composite("Maharashtra");
        Composite dl = new Composite("delhi");
        Composite gj = new Composite("Gujarat");
        Composite kn = new Composite("Karnataka");
        Composite in = new Composite("INDIA");

        mh.add(c1);
        mh.add(c6);
        gj.add(c3);
        gj.add(c4);
        kn.add(c5);
        dl.add(c2);

        in.add(mh);
        in.add(dl);
        in.add(gj);
        in.add(kn);

        in.showCity();



        
    }
}
