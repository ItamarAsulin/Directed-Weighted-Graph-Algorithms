package api.graph;

import api.GeoLocation;
import api.NodeData;

public class NodeDataClass implements NodeData {
    private int key;
    private GeoLocation location;
    private double weight;
    private int tag;
    private String info;

    /**
     * this method is the vertex constructor.
     * @param key
     * @param x
     * @param y
     * @param z
     */
    public NodeDataClass(int key, double x, double y, double z ){
        this.key = key;
        this.location = new GeoLocationClass(x, y, z);
        this.weight = 0;
        this.tag = 0;
        this.info = "key: " + key + ", location: (" + x + ", " + y + ", " + z + "), weight: " + weight + ", tag: " + tag;

    }

    public NodeDataClass(NodeData other){
        this.key = other.getKey();
        double x = other.getLocation().x();
        double y = other.getLocation().y();
        double z = other.getLocation().z();
        this.location = new GeoLocationClass(x,y,z);
        this.weight = 0;
        this.tag = 0;
        this.info = "key: " + key + ", location: (" + x + ", " + y + ", " + z + "), weight: " + weight + ", tag: " + tag;
    }

    /**
     * this method returns the vertex's key.
     * @return key
     */
    @Override
    public int getKey() {
        return this.key;
    }

    /**
     * this method returns the vertex's GeoLocation.
     * @return GeoLocation
     */
    @Override
    public GeoLocation getLocation() {
        return this.location;
    }

    /**
     * this method sets vertex's GeoLocation based ont given GeoLocation.
     * @param p - other GeoLocation
     */
    @Override
    public void setLocation(GeoLocation p) {
        this.location = p;
    }

    /**
     * this method returns the vertex's weight.
     * @return this.weight
     */
    @Override
    public double getWeight() {
        return this.weight;
    }

    /**
     * this method sets the vertex's weight.
     * @return
     */
    @Override
    public void setWeight(double w) {
        this.weight = w;
    }

    /**
     * this method returns the vertex's info String.
     * @return - this.info
     */
    @Override
    public String getInfo() {
        return this.info;
    }

    /**
     * this method sets the vertex's info String
     * @param s
     */
    @Override
    public void setInfo(String s) {
        this.info = s;
    }

    /**
     * this method returns the vertex's tag.
     * @return - this.tag
     */
    @Override
    public int getTag() {
        return this.tag;
    }

    /**
     * this method sets the vertex's tag.
     * @param t - the new value of the tag
     */
    @Override
    public void setTag(int t) {
        this.tag = t;
    }

}
