package oops.singleton;

public class AppConfig {
        private AppConfig() {
		}
      // public static AppConfig obj = new AppConfig();
        public static AppConfig obj = null;
        public static AppConfig getInstance() {
        	if(obj == null) {
        		obj = new AppConfig();
        	}
        	return obj;
        }
}
