import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gi")
@Implements("Deque")
public class Deque {
   @ObfuscatedName("n")
   @ObfuscatedSignature(
      signature = "Lgw;"
   )
   @Export("head")
   public Node head;
   @ObfuscatedName("v")
   @ObfuscatedSignature(
      signature = "Lgw;"
   )
   @Export("current")
   Node current;

   public Deque() {
      this.head = new Node();
      this.head.next = this.head;
      this.head.previous = this.head;
   }

   @ObfuscatedName("n")
   @Export("clear")
   public void clear() {
      while(true) {
         Node var1 = this.head.next;
         if(var1 == this.head) {
            this.current = null;
            return;
         }

         var1.unlink();
      }
   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      signature = "(Lgw;)V"
   )
   @Export("addFront")
   public void addFront(Node var1) {
      if(var1.previous != null) {
         var1.unlink();
      }

      var1.previous = this.head.previous;
      var1.next = this.head;
      var1.previous.next = var1;
      var1.next.previous = var1;
   }

   @ObfuscatedName("y")
   @ObfuscatedSignature(
      signature = "(Lgw;)V"
   )
   @Export("addTail")
   public void addTail(Node var1) {
      if(var1.previous != null) {
         var1.unlink();
      }

      var1.previous = this.head;
      var1.next = this.head.next;
      var1.previous.next = var1;
      var1.next.previous = var1;
   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      signature = "()Lgw;"
   )
   @Export("popFront")
   public Node popFront() {
      Node var1 = this.head.next;
      if(var1 == this.head) {
         return null;
      } else {
         var1.unlink();
         return var1;
      }
   }

   @ObfuscatedName("d")
   @ObfuscatedSignature(
      signature = "()Lgw;"
   )
   @Export("popTail")
   public Node popTail() {
      Node var1 = this.head.previous;
      if(var1 == this.head) {
         return null;
      } else {
         var1.unlink();
         return var1;
      }
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "()Lgw;"
   )
   @Export("getFront")
   public Node getFront() {
      Node var1 = this.head.next;
      if(var1 == this.head) {
         this.current = null;
         return null;
      } else {
         this.current = var1.next;
         return var1;
      }
   }

   @ObfuscatedName("b")
   @ObfuscatedSignature(
      signature = "()Lgw;"
   )
   @Export("getTail")
   public Node getTail() {
      Node var1 = this.head.previous;
      if(var1 == this.head) {
         this.current = null;
         return null;
      } else {
         this.current = var1.previous;
         return var1;
      }
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      signature = "()Lgw;"
   )
   @Export("getNext")
   public Node getNext() {
      Node var1 = this.current;
      if(var1 == this.head) {
         this.current = null;
         return null;
      } else {
         this.current = var1.next;
         return var1;
      }
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "()Lgw;"
   )
   @Export("getPrevious")
   public Node getPrevious() {
      Node var1 = this.current;
      if(var1 == this.head) {
         this.current = null;
         return null;
      } else {
         this.current = var1.previous;
         return var1;
      }
   }

   @ObfuscatedName("r")
   @ObfuscatedSignature(
      signature = "(Lgw;Lgw;)V"
   )
   public static void method3810(Node var0, Node var1) {
      if(var0.previous != null) {
         var0.unlink();
      }

      var0.previous = var1.previous;
      var0.next = var1;
      var0.previous.next = var0;
      var0.next.previous = var0;
   }
}
