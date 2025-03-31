package tech.intellispaces.commons.action;

import tech.intellispaces.commons.action.wrapper.WrapperAction8;
import tech.intellispaces.commons.action.wrapper.WrapperAction9;

import java.util.function.Function;

/**
 * The action form 9.<p/>
 *
 * This is the action form that takes nine inputs and returns result.
 * Inputs can be changed or remain unchanged.
 *
 * @param <R> the action return type.
 * @param <D1> the first input type.
 * @param <D2> the second input type.
 * @param <D3> the third input type.
 * @param <D4> the fourth input type.
 * @param <D5> the fifth input type.
 * @param <D6> the sixth input type.
 * @param <D7> the seventh input type.
 * @param <D8> the eighth input type.
 * @param <D9> the ninth input type.
 */
public interface Action9<R, D1, D2, D3, D4, D5, D6, D7, D8, D9> extends Action {

  /**
   * Executes action.
   */
  R execute(D1 data1, D2 data2, D3 data3, D4 data4, D5 data5, D6 data6, D7 data7, D8 data8, D9 data9);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  int executeReturnInt(D1 data1, D2 data2, D3 data3, D4 data4, D5 data5, D6 data6, D7 data7, D8 data8, D9 data9);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  double executeReturnDouble(D1 data1, D2 data2, D3 data3, D4 data4, D5 data5, D6 data6, D7 data7, D8 data8, D9 data9);

  /**
   * Wraps this action using the wrapper factory and returns action in the form of the action 9.
   *
   * @param wrapperFactory the wrapper factory. It is the function that converts this action to wrapper action.
   * @return the wrapper action.
   * @param <W> the wrapper type.
   * @param <_R> the wrapper return data type.
   * @param <_D1> the wrapper first data type.
   * @param <_D2> the wrapper second data type.
   * @param <_D3> the wrapper third data type.
   * @param <_D4> the wrapper fourth data type.
   * @param <_D5> the wrapper fifth data type.
   * @param <_D6> the wrapper sixth data type.
   * @param <_D7> the wrapper seventh data type.
   * @param <_D8> the wrapper eighth data type.
   * @param <_D9> the wrapper ninth data type.
   */
  <W extends WrapperAction9<_R, _D1, _D2, _D3, _D4, _D5, _D6, _D7, _D8, _D9>, _R, _D1, _D2, _D3, _D4, _D5, _D6, _D7, _D8, _D9> Action9<_R, _D1, _D2, _D3, _D4, _D5, _D6, _D7, _D8, _D9> wrapAction9(
      Function<Action9<R, D1, D2, D3, D4, D5, D6, D7, D8, D9>, W> wrapperFactory
  );
}
