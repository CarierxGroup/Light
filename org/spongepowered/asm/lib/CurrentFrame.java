/*    */ package org.spongepowered.asm.lib;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ class CurrentFrame
/*    */   extends Frame
/*    */ {
/*    */   void execute(int opcode, int arg, ClassWriter cw, Item item) {
/* 50 */     super.execute(opcode, arg, cw, item);
/* 51 */     Frame successor = new Frame();
/* 52 */     merge(cw, successor, 0);
/* 53 */     set(successor);
/* 54 */     this.owner.inputStackTop = 0;
/*    */   }
/*    */ }


/* Location:              D:\工程开发\Cracked\phosphor-1.12.2-0.2.6+build50-universal.jar!\org\spongepowered\asm\lib\CurrentFrame.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.0.7
 */