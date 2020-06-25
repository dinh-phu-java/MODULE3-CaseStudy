package dinhphu.codegym.model;

public class Product {
    int car_id;
    int user_id;
    int image_id;
    String engine_type_id;
    String gear_id;
    String front_wheel_id;
    String fuel_type_id;
    String valves_id;
    double car_price;
    String description;
    String post_date;
    String date_of_manufacture;
    String vendor;
    String car_type;

    public Product(int car_id, int user_id, int image_id, String engine_type_id, String gear_id, String front_wheel_id, String fuel_type_id, String valves_id, double car_price, String description, String post_date, String date_of_manufacture, String vendor, String car_type) {
        this.car_id = car_id;
        this.user_id = user_id;
        this.image_id = image_id;
        this.engine_type_id = engine_type_id;
        this.gear_id = gear_id;
        this.front_wheel_id = front_wheel_id;
        this.fuel_type_id = fuel_type_id;
        this.valves_id = valves_id;
        this.car_price = car_price;
        this.description = description;
        this.post_date = post_date;
        this.date_of_manufacture = date_of_manufacture;
        this.vendor = vendor;
        this.car_type = car_type;
    }

    public Product(int user_id, int image_id, String engine_type_id, String gear_id, String front_wheel_id, String fuel_type_id, String valves_id, double car_price, String description, String post_date, String date_of_manufacture, String vendor, String car_type) {
        car_id=0;
        this.user_id = user_id;
        this.image_id = image_id;
        this.engine_type_id = engine_type_id;
        this.gear_id = gear_id;
        this.front_wheel_id = front_wheel_id;
        this.fuel_type_id = fuel_type_id;
        this.valves_id = valves_id;
        this.car_price = car_price;
        this.description = description;
        this.post_date = post_date;
        this.date_of_manufacture = date_of_manufacture;
        this.vendor = vendor;
        this.car_type = car_type;
    }

    public int getCar_id() {
        return car_id;
    }

    public void setCar_id(int car_id) {
        this.car_id = car_id;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public int getImage_id() {
        return image_id;
    }

    public void setImage_id(int image_id) {
        this.image_id = image_id;
    }

    public String getEngine_type_id() {
        return engine_type_id;
    }

    public void setEngine_type_id(String engine_type_id) {
        this.engine_type_id = engine_type_id;
    }

    public String getGear_id() {
        return gear_id;
    }

    public void setGear_id(String gear_id) {
        this.gear_id = gear_id;
    }

    public String getFront_wheel_id() {
        return front_wheel_id;
    }

    public void setFront_wheel_id(String front_wheel_id) {
        this.front_wheel_id = front_wheel_id;
    }

    public String getFuel_type_id() {
        return fuel_type_id;
    }

    public void setFuel_type_id(String fuel_type_id) {
        this.fuel_type_id = fuel_type_id;
    }

    public String getValves_id() {
        return valves_id;
    }

    public void setValves_id(String valves_id) {
        this.valves_id = valves_id;
    }

    public double getCar_price() {
        return car_price;
    }

    public void setCar_price(double car_price) {
        this.car_price = car_price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPost_date() {
        return post_date;
    }

    public void setPost_date(String post_date) {
        this.post_date = post_date;
    }

    public String getDate_of_manufacture() {
        return date_of_manufacture;
    }

    public void setDate_of_manufacture(String date_of_manufacture) {
        this.date_of_manufacture = date_of_manufacture;
    }

    public String getVendor() {
        return vendor;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    public String getCar_type() {
        return car_type;
    }

    public void setCar_type(String car_type) {
        this.car_type = car_type;
    }
}
