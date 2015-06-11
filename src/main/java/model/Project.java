package model;

public class Project {
	private Faq faq = new Faq();
	private int category;
	private String title;
	private int money;
	int collectedMoney;
	private String description;
	private int daysOff;
	private String urlVideo;
	private String history;
	private int id;

	public int getId() {
		return id;
	}
	public Project() {
	}
	

	public void setId(int id) {
		this.id = id;
	}

	public Project( int id, int category, String title, int money, String description,
			int collectedMoney, int daysOff, String urlVideo, String history, Faq faq) {
		this.id = id;
		this.category = category;
		this.title = title;
		this.money = money;
		this.description = description;
		this.collectedMoney = collectedMoney;
		this.daysOff = daysOff;
		this.urlVideo = urlVideo;
		this.history = history;

	}
	

	public Project(int id, String title, String description, int money, int collectedMoney, int daysOff) {
		this.id=id;
		this.title = title;
		this.money = money;
		this.description = description;
		this.collectedMoney = collectedMoney;
		this.daysOff = daysOff;

	}

	public Faq getFaq() {
		return faq;
	}

	public void setFaq(Faq faq) {
		this.faq = faq;
	}



	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getDaysOff() {
		return daysOff;
	}

	public void setDaysOff(int daysOff) {
		this.daysOff = daysOff;
	}

	public String getUrlVideo() {
		return urlVideo;
	}

	public void setUrlVideo(String urlVideo) {
		this.urlVideo = urlVideo;
	}

	public String getHistory() {
		return history;
	}

	public void setHistory(String history) {
		this.history = history;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getCollectedMoney() {
		return collectedMoney;
	}
	
	public void setCollectedMoney(int sum){
		this.collectedMoney += sum;
		
	}

	public String toString() {
		return (title + "\n" + "Полное описание проекта: " + description + "\n"
				+ "Необходимо собрать: " + money + "грн" + "\n"
				+ "Мы уже собрали: " + collectedMoney + "грн" + "\n"
				+ "Осталось дней до закрытия: " + daysOff + "\n");
	}

	public String allToString() {
		return (title + "\n" + "Полное описание проекта: " + description + "\n"
				+ "Необходимо собрать: " + money + "грн" + "\n"
				+ "Мы уже собрали: " + collectedMoney + "грн" + "\n"
				+ "Осталось дней до закрытия: " + daysOff + "\n" + "••••• Дополнительная информация: " + "\n" + "Демо видео проекта: "
				+ urlVideo + "\n" + "История нашего проекта: " + "\n" + history
				+ "\n" + "FAQ: " + faq.faq + "\n");
	}

	public String getTitle() {
		return title;
	}
	public int getCategory() {
		return category;
	}
	public void setCategory(int category) {
		this.category = category;
	}


}
