	public static String getFormattedDateTime(int year, int month, int day, int hour, int minute, int second) {
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Calendar calendar = Calendar.getInstance();
		calendar.set(year, month-1, day, hour, minute, second);
		return formatter.format(calendar.getTime());
	}
	
	public static String getFormattedDateTimeNow() {
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		return formatter.format(Calendar.getInstance().getTime());
	}
	
	public static String getFormattedDate(int year, int month, int day) {
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		Calendar calendar = Calendar.getInstance();
		calendar.set(year, month-1, day, 0, 0, 0);
		return formatter.format(calendar.getTime());
	}
	
	public static String getFormattedDateNow() {
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		return formatter.format(Calendar.getInstance().getTime());
	}
