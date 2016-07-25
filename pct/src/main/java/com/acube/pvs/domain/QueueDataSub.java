package com.acube.pvs.domain;


public class QueueDataSub {
		
		private String qName;
		private String health;
		private long enqCount;
		private long deqCount;
		private long quingCount;
		private long lTime;
		
		public QueueDataSub() {
			
		}
		public QueueDataSub(String qName, String health, long enqCount, long deqCount, long quingCount, long lTime) {
			this.qName = qName;
			this.health = health;
			this.enqCount = enqCount;
			this.deqCount = deqCount;
			this.quingCount = quingCount;
			this.lTime = lTime;
		}
		public String getqName() {
			return qName;
		}
		public void setqName(String qName) {
			this.qName = qName;
		}
		public String getHealth() {
			return health;
		}
		public void setHealth(String health) {
			this.health = health;
		}
		public long getEnqCount() {
			return enqCount;
		}
		public void setEnqCount(long enqCount) {
			this.enqCount = enqCount;
		}
		public long getDeqCount() {
			return deqCount;
		}
		public void setDeqCount(long deqCount) {
			this.deqCount = deqCount;
		}
		public long getQuingCount() {
			return quingCount;
		}
		public void setQuingCount(long quingCount) {
			this.quingCount = quingCount;
		}
		public long getlTime() {
			return lTime;
		}
		public void setlTime(long lTime) {
			this.lTime = lTime;
		}
}
