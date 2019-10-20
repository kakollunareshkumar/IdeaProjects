public class ObjectToJson {
	public static void main(String[] args) {
		//create object of Organisation
		Organisation org=new Organisation();
		org.setOrganisation_name("GeeksForGeeks");
		org.setDescription("Computer science portal for geeks");
		org.setEmployees(2000);

		ObjectMapper obj=new ObjectMapper();

		try{
			String jsonstr=obj.WriteValueAsString(org);

		}
		catch (Exception e){
			e.printStackTrace();
		}

	}
}
