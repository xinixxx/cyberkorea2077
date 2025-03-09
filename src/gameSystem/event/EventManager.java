package gameSystem.event;

import java.util.HashMap;
import java.util.Map;

import gameSystem.event.normal.NormalEvent201;
import gameSystem.event.normal.NormalEvent202;
import gameSystem.event.normal.NormalEvent203;
import gameSystem.event.normal.NormalEvent204;
import gameSystem.event.normal.NormalEvent205;
import gameSystem.event.normal.NormalEvent206;
import gameSystem.event.normal.NormalEvent207;
import gameSystem.event.normal.NormalEvent208;
import gameSystem.event.normal.NormalEvent209;
import gameSystem.event.normal.NormalEvent210;
import gameSystem.event.normal.NormalEvent211;
import gameSystem.event.normal.NormalEvent212;
import gameSystem.event.normal.NormalEvent213;
import gameSystem.event.normal.NormalEvent214;
import gameSystem.event.normal.NormalEvent215;
import gameSystem.event.normal.NormalEvent216;
import gameSystem.event.normal.NormalEvent217;
import gameSystem.event.normal.NormalEvent218;
import gameSystem.event.normal.NormalEvent219;
import gameSystem.event.normal.NormalEvent220;
import gameSystem.event.normal.NormalEvent221;
import gameSystem.event.normal.NormalEvent222;
import gameSystem.event.normal.NormalEvent223;
import gameSystem.event.normal.NormalEvent224;
import gameSystem.event.normal.NormalEvent225;
import gameSystem.event.normal.NormalEvent226;
import gameSystem.event.normal.NormalEvent227;
import gameSystem.event.normal.NormalEvent228;
import gameSystem.event.normal.NormalEvent229;
import gameSystem.event.normal.NormalEvent230;
import gameSystem.event.story.IntroEvent001;
import gameSystem.event.story.StoryEvent101;
import gameSystem.event.story.StoryEvent102;
import gameSystem.event.story.StoryEvent103;
import gameSystem.event.story.StoryEvent104;
import gameSystem.event.story.StoryEvent105;
import gameSystem.event.story.StoryEvent106;
import gameSystem.event.story.StoryEvent107;
import gameSystem.event.story.StoryEvent108;
import gameSystem.event.story.StoryEvent109;
import gameSystem.event.story.StoryEvent110;
import gameSystem.event.story.StoryEvent111;
import gameSystem.event.story.StoryEvent112;
import gameSystem.event.story.StoryEvent113;
import gameSystem.event.story.StoryEvent114;
import gameSystem.event.story.StoryEvent115;
import gameSystem.event.story.StoryEvent116;
import gameSystem.event.story.StoryEvent117;
import gameSystem.event.story.StoryEvent118;
import gameSystem.event.story.StoryEvent119;
import gameSystem.event.story.StoryEvent120;

public class EventManager {

	private static EventManager eventManagerInstance;
	
	private Map<Integer, Event> events;
	private Event currentEvent;
	
	private EventManager() {
		this.events = new HashMap<Integer, Event>();
		initializedEvents();
	}
	
	public static EventManager getInstance() {
		if (eventManagerInstance == null) {
			eventManagerInstance = new EventManager();
		}
		return eventManagerInstance;
	}
	
	
	public Event getCurrentEvent() {
		if (this.currentEvent == null) {
			return new IntroEvent001();
		}
		return this.currentEvent;
	}
	
	public void setCurrentEvent(int eventId) {
		if(events.containsKey(eventId)) {
			currentEvent = events.get(eventId);
		} else {
			throw new IllegalArgumentException("Unknown event ID : " + eventId);
		}
	}

	public Map<Integer, Event> getEvents() {
		return events;
	}
	
	private void initializedEvents() {
		events.put(001, new IntroEvent001());
		events.put(101, new StoryEvent101());
		events.put(102, new StoryEvent102());
		events.put(103, new StoryEvent103());
		events.put(104, new StoryEvent104());
		events.put(105, new StoryEvent105());
		events.put(106, new StoryEvent106());
		events.put(107, new StoryEvent107());
		events.put(108, new StoryEvent108());
		events.put(109, new StoryEvent109());
		events.put(110, new StoryEvent110());
		events.put(111, new StoryEvent111());
		events.put(112, new StoryEvent112());
		events.put(113, new StoryEvent113());
		events.put(114, new StoryEvent114());
		events.put(115, new StoryEvent115());
		events.put(116, new StoryEvent116());
		events.put(117, new StoryEvent117());
		events.put(118, new StoryEvent118());
		events.put(119, new StoryEvent119());
		events.put(120, new StoryEvent120());
		events.put(201, new NormalEvent201());
		events.put(202, new NormalEvent202());
		events.put(203, new NormalEvent203());
		events.put(204, new NormalEvent204());
		events.put(205, new NormalEvent205());
		events.put(206, new NormalEvent206());
		events.put(207, new NormalEvent207());
		events.put(208, new NormalEvent208());
		events.put(209, new NormalEvent209());
		events.put(210, new NormalEvent210());
		events.put(211, new NormalEvent211());
		events.put(212, new NormalEvent212());
		events.put(213, new NormalEvent213());
		events.put(214, new NormalEvent214());
		events.put(215, new NormalEvent215());
		events.put(216, new NormalEvent216());
		events.put(217, new NormalEvent217());
		events.put(218, new NormalEvent218());
		events.put(219, new NormalEvent219());
		events.put(220, new NormalEvent220());
		events.put(221, new NormalEvent221());
		events.put(222, new NormalEvent222());
		events.put(223, new NormalEvent223());
		events.put(224, new NormalEvent224());
		events.put(225, new NormalEvent225());
		events.put(226, new NormalEvent226());
		events.put(227, new NormalEvent227());
		events.put(228, new NormalEvent228());
		events.put(229, new NormalEvent229());
		events.put(230, new NormalEvent230());
	}
}
