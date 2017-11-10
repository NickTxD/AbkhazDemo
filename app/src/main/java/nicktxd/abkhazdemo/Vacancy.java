package nicktxd.abkhazdemo;

/**
 * Created by gerewget on 10.11.2017.
 */

public class Vacancy {
    private int id;
    private String title;
    private int user_id;
    private String date;
    private int pay_min;
    private String schedule;
    private String city;
    private String experience;
    private String text;
    private int status;
    private String specialization;
    private String skills;
    private String requirements;
    private String conditions;
    private String phone;
    private int sidebar;
    private int allotment;
    private int top;
    private int urgently;
    private int order_top;
    private int pay_max;

    Vacancy(    int id, String title, int user_id, String date, int pay_min,
                  String schedule, String city, String experience, String text,
                  int status, String specialization, String skills, String requirements,
                  String conditions, String phone, int sidebar, int allotment,
                  int top, int urgently, int order_top, int pay_max){
        this.id = id;
        this.title = title;
        this.user_id = user_id;
        this.date = date;
        this.pay_min = pay_min;
        this.schedule = schedule;
        this.city = city;
        this.experience = experience;
        this.text = text;
        this.status = status;
        this.specialization = specialization;
        this.skills = skills;
        this.requirements = requirements;
        this.conditions = conditions;
        this.phone = phone;
        this.sidebar = sidebar;
        this.allotment = allotment;
        this.top = top;
        this.urgently = urgently;
        this.order_top = order_top;
        this.pay_max = pay_max;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getPay_min() {
        return pay_min;
    }

    public void setPay_min(int pay_min) {
        this.pay_min = pay_min;
    }

    public String getSchedule() {
        return schedule;
    }

    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    public String getDescription() {
        return text;
    }

    public void setDescription(String description) {
        this.text = description;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public String getSkills() {
        return skills;
    }

    public void setSkills(String skills) {
        this.skills = skills;
    }

    public String getRequirements() {
        return requirements;
    }

    public void setRequirements(String requirements) {
        this.requirements = requirements;
    }

    public String getConditions() {
        return conditions;
    }

    public void setConditions(String conditions) {
        this.conditions = conditions;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getSidebar() {
        return sidebar;
    }

    public void setSidebar(int sidebar) {
        this.sidebar = sidebar;
    }

    public int getAllotment() {
        return allotment;
    }

    public void setAllotment(int allotment) {
        this.allotment = allotment;
    }

    public int getTop() {
        return top;
    }

    public void setTop(int top) {
        this.top = top;
    }

    public int getUrgently() {
        return urgently;
    }

    public void setUrgently(int urgently) {
        this.urgently = urgently;
    }

    public int getOrder_top() {
        return order_top;
    }

    public void setOrder_top(int order_top) {
        this.order_top = order_top;
    }

    public int getPay_max() {
        return pay_max;
    }

    public void setPay_max(int pay_max) {
        this.pay_max = pay_max;
    }
}
