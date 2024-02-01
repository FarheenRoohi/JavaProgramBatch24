package string;

public class Car {
	class CarTesla {
		String model = "3578Abc";
		String make = "Tesla";
		String year = "2019";

		CarTesla() {
		}

		CarTesla(String model, String make, String year) {
			this.model = model;
			this.make = make;
			this.year = year;
		}

		String getVehicleDisrciption() {
			return year + " " + make + " " + model;
		}

		String getConcatVehicleDisrciption() {
			return year.concat(" ").concat(make).concat(" ").concat(model);
		}

		String getJoinedVehicleDisrciption() {
			return String.join(" ", year, make, model);
		}

		String getSBVehicleDisrciption() {
			StringBuffer sb = new StringBuffer();
			sb.append(year).append(" ").append(make).append(" ").append(model);
			return sb.toString();
		}
	}

	public static void main(String[] args) {
		Car c = new Car();
		CarTesla ct = c.new CarTesla();
		System.out.println(ct.getConcatVehicleDisrciption());
		System.out.println(ct.getJoinedVehicleDisrciption());
		System.out.println(ct.getSBVehicleDisrciption());
		System.out.println(ct.getVehicleDisrciption());

		CarTesla ctc = c.new CarTesla("3762adb", "Bmw", "2020");
		System.out.println(ctc.getConcatVehicleDisrciption());
		System.out.println(ctc.getJoinedVehicleDisrciption());
		System.out.println(ctc.getSBVehicleDisrciption());
		System.out.println(ctc.getVehicleDisrciption());
		System.out.println();
	}

}
