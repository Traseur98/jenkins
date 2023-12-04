package examenII.examenII;

import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonConventer {

  private Object obj;
  private String json;

  public JsonConventer(Object obj) {
    this.obj = obj;
    ObjectMapper objectMapper = new ObjectMapper();
    try {
      this.json = objectMapper.writeValueAsString(obj);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  public Object getObj() {
    return obj;
  }

  public void setObj(Object obj) {
    this.obj = obj;
  }

  public String getJson() {
    return json;
  }

  public void setJson(String json) {
    this.json = json;
  }
  @Override
  public String toString() {
      return json;
  }
}
