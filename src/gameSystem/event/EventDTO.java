package gameSystem.event;

public class EventDTO {

	private static EventDTO eventDTOinstance;
	
	public final int NORMAL_EVENT_INDEX = 30;
	public final int STORY_EVENT_INDEX = 20;
	
	private int currentEventIndex = 001;
	private int currentStoryProgress1 = 0;
	
	private EventDTO() {}
	
	public static EventDTO getInstance() {
		if (eventDTOinstance == null) {
			eventDTOinstance = new EventDTO();
		}
		return eventDTOinstance;
	}

	public void continueStory1() {
		this.currentStoryProgress1++;
	}
	
	public void resetEventDTO() {
		this.currentEventIndex = 001;
		this.currentStoryProgress1 = 0;
	}
	
	// getter & setter
	
	public int getCurrentStoryProgress1() {
		return this.currentStoryProgress1;
	}
	
	public int setCurrentStoryProgress1(int currentStoryProgress1) {
		return this.currentStoryProgress1 = currentStoryProgress1;
	}
	
	public int getCurrentEventIndex() {
		return this.currentEventIndex;
	}

	public void setCurrentEventIndex(int currentEventIndex) {
		this.currentEventIndex = currentEventIndex;
	}
	
	
}
