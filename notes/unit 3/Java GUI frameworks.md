There is quite a lot of gui frameworks out there for java, but what is recognized as today's framework of choice?

The following is my understanding of the different frameworks, please correct me if im wrong. This is a very loosely defined set of questions, but i still think its valuable for anyone thinking of creating rich gui applications.

---

**[AWT](http://en.wikipedia.org/wiki/Java_AWT)**

Is the very foundation of swing, it performs well but is lacking in advanced components. If you intend to create rich applications, AWT is probably not the way to go. However for smaller gui applications that doesn't require rich user interfaces. This might suit perfectly as it's a tried and proven framework.

---

**[Swing](http://en.wikipedia.org/wiki/Java_Swing)**

Based on AWT as previously stated. In its infancy it was regarded as slow and buggy and caused IBM to create SWT for Eclipse. However with Java 5 (or 6?) Swing became the framework of choice for building new applications. Swing has a lot of rich components but are still lacking in some areas. One example being that there isn't a full featured TreeTable component which can do sorting and filtering/searching.

---

**[SWT](http://en.wikipedia.org/wiki/Standard_Widget_Toolkit)**

Created by IBM for Eclipse, they seemed to think that Swing was not suited for Eclipse at the time. By itself is pretty low-level, and it uses the platform's native widgets through JNI. It is not related to Swing and AWT at all. Their API is however somewhat clunky and not intuitive. They do have some advanced component's like a TreeTable. (but i don't think they support sorting and filtering out of the box). SWT uses some native bindings (through JNI?) and the rant on the internet is that this framework should not be used in today's projects. (why not?)

---

**[SwingX](http://en.wikipedia.org/wiki/SwingX)**

Based on Swing and it's mission is to create rich components for swing. Still under development. (not very active though.) Have a very nice set of components, like for example TreeTable. But the TreeTable does not support filtering and sorting as far as i know. It does however support searching with highlighting.

> Note that SwingX is components (AFAIU) that are extensions or compositions of existing Swing components

---

**JGoodies**

A framework which i know nothing about... What is it's strengths and weaknesses? What set's Jgoodies apart from the rest?

> JGoodies OTOH is about PLAFs and layouts.

---

**[JavaFX](http://en.wikipedia.org/wiki/JavaFX)**

The latest flagship of Java/Oracle. promising to be the facto standard in developing rich desktop or web applications.

---

**[Apache Pivot](http://en.wikipedia.org/wiki/Apache_Pivot)**

It renders UI using Java2D, thus minimizing the impact of (IMO, bloated) legacies of Swing and AWT. (@Augustus Thoo)

It's main focus seems to be on RIA (Rich internet applications), but it seems it can also be applied to desktop applications. And as a personal comment, Looks very interesting! I Especially like that it's an apache project.

[https://cwiki.apache.org/PIVOT/frequently-asked-questions-faq.html](https://cwiki.apache.org/PIVOT/frequently-asked-questions-faq.html)

---

**[Qt Jambi](http://en.wikipedia.org/wiki/Qt_Jambi)**

A java wrapper to the native qt library which is written in c/c++. Very powerful, widely used and accepted. Has a lot of GUI components and a easy to use API.

[http://qt-jambi.org/](http://qt-jambi.org/)

---

So, to try to summarize a bit of what im asking:

Say i wanted to create a desktop application today in Java which involves a lot of advanced components, what should i choose? And why?

Which one of these frameworks should be recognized as deprecated and which should be recognized as the frameworks of the distant future?

What is todays de-facto-standard framework and which tools do you utilize to create java gui applications?

---

Source: [Java GUI frameworks. What to choose? Swing, SWT, AWT, SwingX, JGoodies, JavaFX, Apache Pivot? - Stack Overflow](https://stackoverflow.com/questions/7358775/java-gui-frameworks-what-to-choose-swing-swt-awt-swingx-jgoodies-javafx)