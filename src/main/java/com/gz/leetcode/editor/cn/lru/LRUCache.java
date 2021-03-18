package com.gz.leetcode.editor.cn.lru;

import java.util.HashMap;
import java.util.Map;

public class LRUCache {

        private Node head,tail;
        private Map<Integer,Node> map;
        private int capacity;
        private static class Node{
                private int key;
                private int value;
                private Node prev,next;

                public Node(){}
                public Node(int key,int value){
                        this.key = key;
                        this.value = value;
                }
        }
        public LRUCache(int capacity){
                this.capacity = capacity;
                map = new HashMap<>();
                tail = new Node();
                head = new Node();
                head.next = tail;
                tail.prev = head;
        }

        public int get(int key){
                Node node = map.get(key);
                if(node == null){
                        return -1;
                }
                 removeNode(node);
                 addNode(node);
                return node.value;
        }
        public void put(int key,int value){
                Node node = map.get(key);
                if(node == null){
                        node = new Node(key,value);
                        if(map.size() == capacity){
                                Node prev = tail.prev;
                                removeNode(prev);
                                map.remove(prev.key);
                        }
                        addNode(node);
                        map.put(key,node);
                }else {
                        removeNode(node);
                        node.value = value;
                        addNode(node);

                }

        }
        public void removeNode(Node node){
                node.prev.next = node.next;
                node.next.prev = node.prev;
        }
        public void addNode(Node node){
                node.prev = head;
                node.next = head.next;
                head.next.prev = node;
                head.next = node;

        }
}