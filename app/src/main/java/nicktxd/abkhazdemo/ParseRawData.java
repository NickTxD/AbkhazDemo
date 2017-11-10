package nicktxd.abkhazdemo;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;

/**
 * Created by gerewget on 10.11.2017.
 */

public class ParseRawData {
    ArrayList<Vacancy> getVacancies(String rawData){
        JSONObject dataJsonObj = null;
        ArrayList<Vacancy> vacancies_result = new ArrayList<>();

        try {
            dataJsonObj = new JSONObject(rawData);
            JSONArray vacancies_raw = dataJsonObj.getJSONArray("data");
            for (int i=0; i<vacancies_raw.length(); i++){
                try {
                    JSONObject vaсancy_raw = vacancies_raw.getJSONObject(i);
                    int id = vaсancy_raw.getInt("id");
                    String title = vaсancy_raw.getString("title");
                    int user_id = vaсancy_raw.getInt("user_id");
                    String date = vaсancy_raw.getString("date");
                    int pay_min = vaсancy_raw.getInt("price");
                    String schedule = vaсancy_raw.getString("grafik");
                    String city = vaсancy_raw.getString("city");
                    String experience = vaсancy_raw.getString("experience");
                    String text = vaсancy_raw.getString("text");
                    int status = vaсancy_raw.getInt("status");
                    String specialization = vaсancy_raw.getString("specialization");
                    String skills = vaсancy_raw.getString("duties");
                    String requirements = vaсancy_raw.getString("requirements");
                    String conditions = vaсancy_raw.getString("conditions");
                    String phone = vaсancy_raw.getString("phone");
                    int sidebar = vaсancy_raw.getInt("sidebar");
                    int allotment = vaсancy_raw.getInt("vidilenie");
                    int top = vaсancy_raw.getInt("top");
                    int urgently = vaсancy_raw.getInt("srochno");
                    int order_top = vaсancy_raw.getInt("poryadok");
                    int pay_max = vaсancy_raw.getInt("price2");
                    Vacancy vacancy_result = new Vacancy(id, title, user_id, date, pay_min, schedule,
                            city, experience, text, status, specialization, skills, requirements,conditions,
                            phone, sidebar, allotment, top, urgently, order_top, pay_max);
                    vacancies_result.add(vacancy_result);
                }catch (Exception e){}
            }
        }catch (Exception e){}
        return vacancies_result;
    }
}
