package Account;

public class Vehicle {

	private String model;
	private String reg_num;
	private String make;
	private String colour;
	private String engine_serial_no;
	private String chassis_no;

	/**
	 * 
	 * @param model
	 * @param reg
	 * @param make
	 * @param n
	 */
	public Vehicle(String model, String reg, String make, String n) {
		// TODO - implement Vehicle.Vehicle
		throw new UnsupportedOperationException();
	}

	public String getModel() {
		return this.model;
	}

	/**
	 * 
	 * @param model
	 */
	public void setModel(String model) {
		this.model = model;
	}

	public String getReg_num() {
		return this.reg_num;
	}

	/**
	 * 
	 * @param reg_num
	 */
	public void setReg_num(String reg_num) {
		this.reg_num = reg_num;
	}

	public String getMake() {
		return this.make;
	}

	/**
	 * 
	 * @param make
	 */
	public void setMake(String make) {
		this.make = make;
	}

	public String getColour() {
		return this.colour;
	}

	/**
	 * 
	 * @param colour
	 */
	public void setColour(String colour) {
		this.colour = colour;
	}

	public String getEngine_serial_no() {
		return this.engine_serial_no;
	}

	/**
	 * 
	 * @param engine_serial_no
	 */
	public void setEngine_serial_no(String engine_serial_no) {
		this.engine_serial_no = engine_serial_no;
	}

	public String getChassis_no() {
		return this.chassis_no;
	}

	/**
	 * 
	 * @param chassis_no
	 */
	public void setChassis_no(String chassis_no) {
		this.chassis_no = chassis_no;
	}

}